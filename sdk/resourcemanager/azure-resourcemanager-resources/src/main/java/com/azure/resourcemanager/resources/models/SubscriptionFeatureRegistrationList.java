// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.fluent.models.SubscriptionFeatureRegistrationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of subscription feature registrations. */
@Fluent
public final class SubscriptionFeatureRegistrationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionFeatureRegistrationList.class);

    /*
     * The link used to get the next page of subscription feature registrations
     * list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of subscription feature registrations.
     */
    @JsonProperty(value = "value")
    private List<SubscriptionFeatureRegistrationInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of subscription feature registrations list.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of subscription feature registrations list.
     *
     * @param nextLink the nextLink value to set.
     * @return the SubscriptionFeatureRegistrationList object itself.
     */
    public SubscriptionFeatureRegistrationList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of subscription feature registrations.
     *
     * @return the value value.
     */
    public List<SubscriptionFeatureRegistrationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of subscription feature registrations.
     *
     * @param value the value value to set.
     * @return the SubscriptionFeatureRegistrationList object itself.
     */
    public SubscriptionFeatureRegistrationList withValue(List<SubscriptionFeatureRegistrationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}