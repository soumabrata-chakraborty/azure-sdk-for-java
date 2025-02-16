// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The information of an AvailablePrivateEndpointType. */
@Fluent
public final class AvailablePrivateEndpointTypeInner {
    /*
     * The name of the service and resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique identifier of the AvailablePrivateEndpoint Type resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The name of the service and resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Display name of the resource.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name property: The name of the service and resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service and resource.
     *
     * @param name the name value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @param id the id value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceName property: The name of the service and resource.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The name of the service and resource.
     *
     * @param resourceName the resourceName value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the displayName property: Display name of the resource.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the resource.
     *
     * @param displayName the displayName value to set.
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
