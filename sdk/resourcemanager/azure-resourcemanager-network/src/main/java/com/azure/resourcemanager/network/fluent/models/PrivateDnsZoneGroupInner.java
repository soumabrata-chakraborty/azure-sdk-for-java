// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.PrivateDnsZoneConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Private dns zone group resource. */
@Fluent
public final class PrivateDnsZoneGroupInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateDnsZoneGroupInner.class);

    /*
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Properties of the private dns zone group.
     */
    @JsonProperty(value = "properties")
    private PrivateDnsZoneGroupPropertiesFormat innerProperties;

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the PrivateDnsZoneGroupInner object itself.
     */
    public PrivateDnsZoneGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Properties of the private dns zone group.
     *
     * @return the innerProperties value.
     */
    private PrivateDnsZoneGroupPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateDnsZoneGroupInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private dns zone group resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @return the privateDnsZoneConfigs value.
     */
    public List<PrivateDnsZoneConfig> privateDnsZoneConfigs() {
        return this.innerProperties() == null ? null : this.innerProperties().privateDnsZoneConfigs();
    }

    /**
     * Set the privateDnsZoneConfigs property: A collection of private dns zone configurations of the private dns zone
     * group.
     *
     * @param privateDnsZoneConfigs the privateDnsZoneConfigs value to set.
     * @return the PrivateDnsZoneGroupInner object itself.
     */
    public PrivateDnsZoneGroupInner withPrivateDnsZoneConfigs(List<PrivateDnsZoneConfig> privateDnsZoneConfigs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateDnsZoneGroupPropertiesFormat();
        }
        this.innerProperties().withPrivateDnsZoneConfigs(privateDnsZoneConfigs);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}