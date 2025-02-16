// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Asset Storage container SAS URLs. */
@Fluent
public final class AssetContainerSasInner {
    /*
     * The list of Asset container SAS URLs.
     */
    @JsonProperty(value = "assetContainerSasUrls")
    private List<String> assetContainerSasUrls;

    /**
     * Get the assetContainerSasUrls property: The list of Asset container SAS URLs.
     *
     * @return the assetContainerSasUrls value.
     */
    public List<String> assetContainerSasUrls() {
        return this.assetContainerSasUrls;
    }

    /**
     * Set the assetContainerSasUrls property: The list of Asset container SAS URLs.
     *
     * @param assetContainerSasUrls the assetContainerSasUrls value to set.
     * @return the AssetContainerSasInner object itself.
     */
    public AssetContainerSasInner withAssetContainerSasUrls(List<String> assetContainerSasUrls) {
        this.assetContainerSasUrls = assetContainerSasUrls;
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
