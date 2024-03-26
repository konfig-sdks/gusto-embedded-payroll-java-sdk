# PaymentConfigsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompanyPaymentConfigs**](PaymentConfigsApi.md#getCompanyPaymentConfigs) | **GET** /v1/companies/{company_uuid}/payment_configs | Get a company&#39;s payment configs |
| [**updateCompanyPaymentConfigs**](PaymentConfigsApi.md#updateCompanyPaymentConfigs) | **PUT** /v1/companies/{company_uuid}/payment_configs | Update a company&#39;s payment configs |


<a name="getCompanyPaymentConfigs"></a>
# **getCompanyPaymentConfigs**
> PaymentConfigs getCompanyPaymentConfigs(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a company&#39;s payment configs

Get payment speed for the company and fast payment limit (1-day is only applicable to partners that opt in).  scope: &#x60;company_payment_configs:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentConfigsApi;
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
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaymentConfigs result = client
              .paymentConfigs
              .getCompanyPaymentConfigs(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getPartnerUuid());
      System.out.println(result.getFastPaymentLimit());
      System.out.println(result.getPaymentSpeed());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentConfigsApi#getCompanyPaymentConfigs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentConfigs> response = client
              .paymentConfigs
              .getCompanyPaymentConfigs(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentConfigsApi#getCompanyPaymentConfigs");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PaymentConfigs**](PaymentConfigs.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateCompanyPaymentConfigs"></a>
# **updateCompanyPaymentConfigs**
> PaymentConfigs updateCompanyPaymentConfigs(companyUuid).xGustoAPIVersion(xGustoAPIVersion).paymentConfigsUpdateCompanyPaymentConfigsRequest(paymentConfigsUpdateCompanyPaymentConfigsRequest).execute();

Update a company&#39;s payment configs

Update payment speed and fast payment limit for a company. At least one of &#x60;payment_speed&#x60; or &#x60;fast_payment_limit&#x60; parameters is required. 1-day option is only applicable to partners that opt in.  scope: &#x60;company_payment_configs:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentConfigsApi;
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
    String fastPaymentLimit = "fastPaymentLimit_example"; // Fast payment limit. This limit is an aggregate of all fast payrolls amount.
    String paymentSpeed = "1-day"; // Gusto Embedded supports three payment speeds (1-day, 2-day, and 4-day). For next-day payments, funds are deposited in your team's bank account by the end of the next business day. Most people will see the funds arrive the next afternoon, but payments may arrive as late as the end of the business day.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PaymentConfigs result = client
              .paymentConfigs
              .updateCompanyPaymentConfigs(fastPaymentLimit, paymentSpeed, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getPartnerUuid());
      System.out.println(result.getFastPaymentLimit());
      System.out.println(result.getPaymentSpeed());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentConfigsApi#updateCompanyPaymentConfigs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentConfigs> response = client
              .paymentConfigs
              .updateCompanyPaymentConfigs(fastPaymentLimit, paymentSpeed, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentConfigsApi#updateCompanyPaymentConfigs");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **paymentConfigsUpdateCompanyPaymentConfigsRequest** | [**PaymentConfigsUpdateCompanyPaymentConfigsRequest**](PaymentConfigsUpdateCompanyPaymentConfigsRequest.md)|  | [optional] |

### Return type

[**PaymentConfigs**](PaymentConfigs.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

