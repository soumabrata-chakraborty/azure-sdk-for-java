// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.fluent.models.MaintenanceConfigurationInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MaintenanceConfigurationsClient. */
public interface MaintenanceConfigurationsClient {
    /**
     * Gets a list of maintenance configurations in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenance configurations in the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MaintenanceConfigurationInner> listByManagedClusterAsync(String resourceGroupName, String resourceName);

    /**
     * Gets a list of maintenance configurations in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenance configurations in the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MaintenanceConfigurationInner> listByManagedCluster(String resourceGroupName, String resourceName);

    /**
     * Gets a list of maintenance configurations in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of maintenance configurations in the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MaintenanceConfigurationInner> listByManagedCluster(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MaintenanceConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, String configName);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MaintenanceConfigurationInner> getAsync(String resourceGroupName, String resourceName, String configName);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner get(String resourceGroupName, String resourceName, String configName);

    /**
     * Gets the specified maintenance configuration of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified maintenance configuration of a managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> getWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context);

    /**
     * Creates or updates a maintenance configuration in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param parameters The maintenance configuration to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned maintenance configuration, used to configure when updates can be deployed to a Managed Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MaintenanceConfigurationInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String resourceName, String configName, MaintenanceConfigurationInner parameters);

    /**
     * Creates or updates a maintenance configuration in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param parameters The maintenance configuration to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned maintenance configuration, used to configure when updates can be deployed to a Managed Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MaintenanceConfigurationInner> createOrUpdateAsync(
        String resourceGroupName, String resourceName, String configName, MaintenanceConfigurationInner parameters);

    /**
     * Creates or updates a maintenance configuration in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param parameters The maintenance configuration to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned maintenance configuration, used to configure when updates can be deployed to a Managed Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner createOrUpdate(
        String resourceGroupName, String resourceName, String configName, MaintenanceConfigurationInner parameters);

    /**
     * Creates or updates a maintenance configuration in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param parameters The maintenance configuration to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned maintenance configuration, used to configure when updates can be deployed to a Managed Cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String resourceName,
        String configName,
        MaintenanceConfigurationInner parameters,
        Context context);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName, String configName);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String resourceName, String configName);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String configName);

    /**
     * Deletes a maintenance configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param configName The name of the maintenance configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String configName, Context context);
}