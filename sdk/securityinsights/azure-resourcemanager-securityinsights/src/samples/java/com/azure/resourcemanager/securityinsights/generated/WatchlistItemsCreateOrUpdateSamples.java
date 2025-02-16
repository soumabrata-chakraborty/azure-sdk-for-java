// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import java.util.HashMap;
import java.util.Map;

/** Samples for WatchlistItems CreateOrUpdate. */
public final class WatchlistItemsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/watchlists/CreateWatchlistItem.json
     */
    /**
     * Sample code: Creates or updates a watchlist item.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void createsOrUpdatesAWatchlistItem(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .watchlistItems()
            .define("82ba292c-dc97-4dfc-969d-d4dd9e666842")
            .withExistingWatchlist("myRg", "myWorkspace", "highValueAsset")
            .withEtag("0300bf09-0000-0000-0000-5c37296e0000")
            .withItemsKeyValue(
                mapOf(
                    "Business tier",
                    "10.0.2.0/24",
                    "Data tier",
                    "10.0.2.0/24",
                    "Gateway subnet",
                    "10.0.255.224/27",
                    "Private DMZ in",
                    "10.0.0.0/27",
                    "Public DMZ out",
                    "10.0.0.96/27",
                    "Web Tier",
                    "10.0.1.0/24"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
