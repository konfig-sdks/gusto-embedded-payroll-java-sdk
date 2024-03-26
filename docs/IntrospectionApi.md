# IntrospectionApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeRefreshToken**](IntrospectionApi.md#exchangeRefreshToken) | **POST** /oauth/token | Refresh access token |
| [**getCurrentAccessTokenInfo**](IntrospectionApi.md#getCurrentAccessTokenInfo) | **GET** /v1/token_info | Get info about the current access token |


<a name="exchangeRefreshToken"></a>
# **exchangeRefreshToken**
> Authentication exchangeRefreshToken().xGustoAPIVersion(xGustoAPIVersion).introspectionExchangeRefreshTokenRequest(introspectionExchangeRefreshTokenRequest).execute();

Refresh access token

Exchange a refresh token for a new access token.  The previous &#x60;refresh_token&#x60; will be revoked on the first usage of the new &#x60;access_token&#x60;.  The &#x60;expires_in&#x60; value is provided in seconds from when the &#x60;access_token&#x60; was generated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntrospectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String clientId = "clientId_example"; // Your client id
    String clientSecret = "clientSecret_example"; // Your client secret
    String refreshToken = "refreshToken_example"; // The `refresh_token` being exchanged for an access token code
    String grantType = "grantType_example"; // this should be the literal string 'refresh_token'
    String redirectUri = "redirectUri_example"; // The redirect URI you set up via the Developer Portal
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Authentication result = client
              .introspection
              .exchangeRefreshToken(clientId, clientSecret, refreshToken, grantType)
              .redirectUri(redirectUri)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntrospectionApi#exchangeRefreshToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Authentication> response = client
              .introspection
              .exchangeRefreshToken(clientId, clientSecret, refreshToken, grantType)
              .redirectUri(redirectUri)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntrospectionApi#exchangeRefreshToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **introspectionExchangeRefreshTokenRequest** | [**IntrospectionExchangeRefreshTokenRequest**](IntrospectionExchangeRefreshTokenRequest.md)|  | [optional] |

### Return type

[**Authentication**](Authentication.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="getCurrentAccessTokenInfo"></a>
# **getCurrentAccessTokenInfo**
> IntrospectionGetCurrentAccessTokenInfoResponse getCurrentAccessTokenInfo().xGustoAPIVersion(xGustoAPIVersion).execute();

Get info about the current access token

Returns scope and resource information associated with the current access token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntrospectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      IntrospectionGetCurrentAccessTokenInfoResponse result = client
              .introspection
              .getCurrentAccessTokenInfo()
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getScope());
      System.out.println(result.getResource());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntrospectionApi#getCurrentAccessTokenInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntrospectionGetCurrentAccessTokenInfoResponse> response = client
              .introspection
              .getCurrentAccessTokenInfo()
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntrospectionApi#getCurrentAccessTokenInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**IntrospectionGetCurrentAccessTokenInfoResponse**](IntrospectionGetCurrentAccessTokenInfoResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

