// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.PartnerDestinationsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerDestinationInner;
import com.azure.resourcemanager.eventgrid.models.PartnerDestination;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinations;

public final class PartnerDestinationsImpl implements PartnerDestinations {
    private static final ClientLogger LOGGER = new ClientLogger(PartnerDestinationsImpl.class);

    private final PartnerDestinationsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public PartnerDestinationsImpl(
        PartnerDestinationsClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PartnerDestination getByResourceGroup(String resourceGroupName, String partnerDestinationName) {
        PartnerDestinationInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, partnerDestinationName);
        if (inner != null) {
            return new PartnerDestinationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerDestination> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerDestinationName, Context context) {
        Response<PartnerDestinationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, partnerDestinationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerDestinationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String partnerDestinationName) {
        this.serviceClient().delete(resourceGroupName, partnerDestinationName);
    }

    public void delete(String resourceGroupName, String partnerDestinationName, Context context) {
        this.serviceClient().delete(resourceGroupName, partnerDestinationName, context);
    }

    public PagedIterable<PartnerDestination> list() {
        PagedIterable<PartnerDestinationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PartnerDestinationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerDestination> list(String filter, Integer top, Context context) {
        PagedIterable<PartnerDestinationInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PartnerDestinationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerDestination> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PartnerDestinationInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PartnerDestinationImpl(inner1, this.manager()));
    }

    public PagedIterable<PartnerDestination> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<PartnerDestinationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new PartnerDestinationImpl(inner1, this.manager()));
    }

    public PartnerDestination activate(String resourceGroupName, String partnerDestinationName) {
        PartnerDestinationInner inner = this.serviceClient().activate(resourceGroupName, partnerDestinationName);
        if (inner != null) {
            return new PartnerDestinationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PartnerDestination> activateWithResponse(
        String resourceGroupName, String partnerDestinationName, Context context) {
        Response<PartnerDestinationInner> inner =
            this.serviceClient().activateWithResponse(resourceGroupName, partnerDestinationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PartnerDestinationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PartnerDestination getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerDestinationName = Utils.getValueFromIdByName(id, "partnerDestinations");
        if (partnerDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerDestinations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, partnerDestinationName, Context.NONE).getValue();
    }

    public Response<PartnerDestination> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerDestinationName = Utils.getValueFromIdByName(id, "partnerDestinations");
        if (partnerDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerDestinations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, partnerDestinationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerDestinationName = Utils.getValueFromIdByName(id, "partnerDestinations");
        if (partnerDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerDestinations'.", id)));
        }
        this.delete(resourceGroupName, partnerDestinationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerDestinationName = Utils.getValueFromIdByName(id, "partnerDestinations");
        if (partnerDestinationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerDestinations'.", id)));
        }
        this.delete(resourceGroupName, partnerDestinationName, context);
    }

    private PartnerDestinationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    public PartnerDestinationImpl define(String name) {
        return new PartnerDestinationImpl(name, this.manager());
    }
}
