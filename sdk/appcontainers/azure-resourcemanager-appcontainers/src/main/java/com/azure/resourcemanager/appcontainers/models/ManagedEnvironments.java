// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner;

/** Resource collection API of ManagedEnvironments. */
public interface ManagedEnvironments {
    /**
     * Get all Managed Environments for a subscription.
     *
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Managed Environments for a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedEnvironment> list();

    /**
     * Get all Managed Environments for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Managed Environments for a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedEnvironment> list(Context context);

    /**
     * Get all the Managed Environments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Managed Environments in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedEnvironment> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the Managed Environments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Managed Environments in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedEnvironment> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps.
     */
    ManagedEnvironment getByResourceGroup(String resourceGroupName, String environmentName);

    /**
     * Get the properties of a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps along with {@link Response}.
     */
    Response<ManagedEnvironment> getByResourceGroupWithResponse(
        String resourceGroupName, String environmentName, Context context);

    /**
     * Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String environmentName);

    /**
     * Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String environmentName, Context context);

    /**
     * Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope);

    /**
     * Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope, Context context);

    /**
     * Get the properties of a Managed Environment used to host container apps.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps along with {@link Response}.
     */
    ManagedEnvironment getById(String id);

    /**
     * Get the properties of a Managed Environment used to host container apps.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps along with {@link Response}.
     */
    Response<ManagedEnvironment> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Managed Environment if it does not have any container apps.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Managed Environment if it does not have any container apps.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedEnvironment resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedEnvironment definition.
     */
    ManagedEnvironment.DefinitionStages.Blank define(String name);
}
