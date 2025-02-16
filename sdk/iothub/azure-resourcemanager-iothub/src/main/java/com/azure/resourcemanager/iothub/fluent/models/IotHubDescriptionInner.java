// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.models.ArmIdentity;
import com.azure.resourcemanager.iothub.models.IotHubProperties;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The description of the IoT hub. */
@Fluent
public final class IotHubDescriptionInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubDescriptionInner.class);

    /*
     * The Etag field is *not* required. If it is provided in the response
     * body, it must also be provided as a header per the normal ETag
     * convention.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * IotHub properties
     */
    @JsonProperty(value = "properties")
    private IotHubProperties properties;

    /*
     * IotHub SKU info
     */
    @JsonProperty(value = "sku", required = true)
    private IotHubSkuInfo sku;

    /*
     * The managed identities for the IotHub.
     */
    @JsonProperty(value = "identity")
    private ArmIdentity identity;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @param etag the etag value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: IotHub properties.
     *
     * @return the properties value.
     */
    public IotHubProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: IotHub properties.
     *
     * @param properties the properties value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withProperties(IotHubProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: IotHub SKU info.
     *
     * @return the sku value.
     */
    public IotHubSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: IotHub SKU info.
     *
     * @param sku the sku value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withSku(IotHubSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The managed identities for the IotHub.
     *
     * @return the identity value.
     */
    public ArmIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identities for the IotHub.
     *
     * @param identity the identity value to set.
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withIdentity(ArmIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model IotHubDescriptionInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
