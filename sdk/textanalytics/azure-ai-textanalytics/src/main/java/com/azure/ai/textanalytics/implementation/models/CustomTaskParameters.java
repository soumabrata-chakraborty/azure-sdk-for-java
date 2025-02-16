// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters object for a text analysis task using custom models. */
@Fluent
public class CustomTaskParameters extends TaskParameters {
    /*
     * The projectName property.
     */
    @JsonProperty(value = "projectName", required = true)
    private String projectName;

    /*
     * The deploymentName property.
     */
    @JsonProperty(value = "deploymentName", required = true)
    private String deploymentName;

    /**
     * Get the projectName property: The projectName property.
     *
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: The projectName property.
     *
     * @param projectName the projectName value to set.
     * @return the CustomTaskParameters object itself.
     */
    public CustomTaskParameters setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get the deploymentName property: The deploymentName property.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The deploymentName property.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the CustomTaskParameters object itself.
     */
    public CustomTaskParameters setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
}
