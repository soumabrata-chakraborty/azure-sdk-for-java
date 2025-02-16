// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.LocalizableString;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Usage of the quota resource. */
@Fluent
public final class CsmUsageQuotaInner {
    /*
     * Units of measurement for the quota resource.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Next reset time for the resource counter.
     */
    @JsonProperty(value = "nextResetTime")
    private OffsetDateTime nextResetTime;

    /*
     * The current value of the resource counter.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /*
     * The resource limit.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * Quota name.
     */
    @JsonProperty(value = "name")
    private LocalizableString name;

    /**
     * Get the unit property: Units of measurement for the quota resource.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Units of measurement for the quota resource.
     *
     * @param unit the unit value to set.
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the nextResetTime property: Next reset time for the resource counter.
     *
     * @return the nextResetTime value.
     */
    public OffsetDateTime nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime property: Next reset time for the resource counter.
     *
     * @param nextResetTime the nextResetTime value to set.
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withNextResetTime(OffsetDateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the currentValue property: The current value of the resource counter.
     *
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the resource counter.
     *
     * @param currentValue the currentValue value to set.
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The resource limit.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The resource limit.
     *
     * @param limit the limit value to set.
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: Quota name.
     *
     * @return the name value.
     */
    public LocalizableString name() {
        return this.name;
    }

    /**
     * Set the name property: Quota name.
     *
     * @param name the name value to set.
     * @return the CsmUsageQuotaInner object itself.
     */
    public CsmUsageQuotaInner withName(LocalizableString name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
