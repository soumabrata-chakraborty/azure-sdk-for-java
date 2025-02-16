// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgressReporterTest {

    private final ListProgressListener listener = new ListProgressListener();

    @Test
    public void listenerMustNotBeNull() {
        assertThrows(NullPointerException.class, () -> ProgressReporter.withProgressListener(null));
    }

    @Test
    public void whenNothingHappens() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);

        assertEquals(Collections.emptyList(), listener.getProgresses());
    }

    @Test
    public void canReportProgress() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);

        progressReporter.reportProgress(1);
        progressReporter.reportProgress(3);
        progressReporter.reportProgress(5);

        assertEquals(Arrays.asList(1L, 4L, 9L), listener.getProgresses());
    }

    @Test
    public void canResetProgress() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);

        progressReporter.reportProgress(5);
        progressReporter.reset();

        assertEquals(Arrays.asList(5L, 0L), listener.getProgresses());
    }

    @Test
    public void canResetProgressInTheMiddle() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);

        progressReporter.reportProgress(5);
        progressReporter.reset();
        progressReporter.reportProgress(4);

        assertEquals(Arrays.asList(5L, 0L, 4L), listener.getProgresses());
    }

    @Test
    public void childrenCanReportProgress() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);
        ProgressReporter child1 = progressReporter.createChild();
        ProgressReporter child2 = progressReporter.createChild();

        progressReporter.reportProgress(1);
        child1.reportProgress(7);
        progressReporter.reportProgress(3);
        child2.reportProgress(11);
        progressReporter.reportProgress(5);

        assertEquals(Arrays.asList(1L, 8L, 11L, 22L, 27L), listener.getProgresses());
    }

    @Test
    public void childrenCanResetProgress() {
        ProgressReporter progressReporter = ProgressReporter.withProgressListener(listener);
        ProgressReporter child1 = progressReporter.createChild();
        ProgressReporter child2 = progressReporter.createChild();

        progressReporter.reportProgress(1);
        child1.reportProgress(7);
        child1.reset();
        progressReporter.reportProgress(3);
        child2.reportProgress(11);
        progressReporter.reportProgress(5);
        child2.reset();

        assertEquals(Arrays.asList(1L, 8L, 1L, 4L, 15L, 20L, 9L), listener.getProgresses());
    }

    private static class ListProgressListener implements ProgressListener {
        private final List<Long> progresses = new ArrayList<>();

        @Override
        public void handleProgress(long bytesTransferred) {
            progresses.add(bytesTransferred);
        }

        public List<Long> getProgresses() {
            return Collections.unmodifiableList(progresses);
        }
    }
}
