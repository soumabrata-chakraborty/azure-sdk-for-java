// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.AzureFunctionActivityMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Function activity type properties. */
@Fluent
public final class AzureFunctionActivityTypeProperties {
    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "method", required = true)
    private AzureFunctionActivityMethod method;

    /*
     * Name of the Function that the Azure Function Activity will call. Type:
     * string (or Expression with resultType string)
     */
    @JsonProperty(value = "functionName", required = true)
    private Object functionName;

    /*
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "body")
    private Object body;

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public AzureFunctionActivityMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the AzureFunctionActivityTypeProperties object itself.
     */
    public AzureFunctionActivityTypeProperties withMethod(AzureFunctionActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     *
     * @return the functionName value.
     */
    public Object functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     *
     * @param functionName the functionName value to set.
     * @return the AzureFunctionActivityTypeProperties object itself.
     */
    public AzureFunctionActivityTypeProperties withFunctionName(Object functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the AzureFunctionActivityTypeProperties object itself.
     */
    public AzureFunctionActivityTypeProperties withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the AzureFunctionActivityTypeProperties object itself.
     */
    public AzureFunctionActivityTypeProperties withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (method() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property method in model AzureFunctionActivityTypeProperties"));
        }
        if (functionName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property functionName in model AzureFunctionActivityTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFunctionActivityTypeProperties.class);
}
