# GeneratedDocumentsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentByRequestUuid**](GeneratedDocumentsApi.md#getDocumentByRequestUuid) | **GET** /v1/generated_documents/{document_type}/{request_uuid} | Get a generated document |


<a name="getDocumentByRequestUuid"></a>
# **getDocumentByRequestUuid**
> GeneratedDocument getDocumentByRequestUuid(documentType, requestUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a generated document

Get a generated document given the request_uuid. The response will include the generation request&#39;s status and, if complete, the relevant document urls.  scope: &#x60;generated_documents:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneratedDocumentsApi;
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
    String documentType = "documentType_example"; // the type of document being generated
    String requestUuid = "requestUuid_example"; // The UUID of the Generated Document Request
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      GeneratedDocument result = client
              .generatedDocuments
              .getDocumentByRequestUuid(documentType, requestUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getRequestUuid());
      System.out.println(result.getStatus());
      System.out.println(result.getDocumentUrls());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneratedDocumentsApi#getDocumentByRequestUuid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GeneratedDocument> response = client
              .generatedDocuments
              .getDocumentByRequestUuid(documentType, requestUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneratedDocumentsApi#getDocumentByRequestUuid");
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
| **documentType** | **String**| the type of document being generated | |
| **requestUuid** | **String**| The UUID of the Generated Document Request | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**GeneratedDocument**](GeneratedDocument.md)

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

