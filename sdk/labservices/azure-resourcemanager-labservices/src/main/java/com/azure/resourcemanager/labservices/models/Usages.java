// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * Returns list of usage per SKU family for the specified subscription in the specified region.
     *
     * @param location The location name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Core Usages.
     */
    PagedIterable<Usage> listByLocation(String location);

    /**
     * Returns list of usage per SKU family for the specified subscription in the specified region.
     *
     * @param location The location name.
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Core Usages.
     */
    PagedIterable<Usage> listByLocation(String location, String filter, Context context);
}
