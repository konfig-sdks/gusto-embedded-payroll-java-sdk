# EventsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get30DayEvents**](EventsApi.md#get30DayEvents) | **GET** /v1/events | Get all events |


<a name="get30DayEvents"></a>
# **get30DayEvents**
> List&lt;Event&gt; get30DayEvents().startingAfterUuid(startingAfterUuid).resourceUuid(resourceUuid).limit(limit).eventType(eventType).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all events

Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.  &gt; 📘 Token Authentication &gt; &gt; This endpoint uses the [organization level api token and the Token scheme with HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/authentication#api-token-authentication).  scope: &#x60;events:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String startingAfterUuid = "startingAfterUuid_example"; // A cursor for pagination. Returns all events occuring after the specified UUID (exclusive)
    String resourceUuid = "resourceUuid_example"; // The UUID of the company. If not specified, will return all events for all companies.
    String limit = "limit_example"; // Limits the number of objects returned in a single response, between 1 and 100. The default is 25
    String eventType = "eventType_example"; // A string containing the exact event name (e.g. `employee.created`), or use a wildcard match to filter for a group of events (e.g. `employee.*`, `*.created`, `notification.*.created` etc.)
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Event> result = client
              .events
              .get30DayEvents()
              .startingAfterUuid(startingAfterUuid)
              .resourceUuid(resourceUuid)
              .limit(limit)
              .eventType(eventType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#get30DayEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Event>> response = client
              .events
              .get30DayEvents()
              .startingAfterUuid(startingAfterUuid)
              .resourceUuid(resourceUuid)
              .limit(limit)
              .eventType(eventType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#get30DayEvents");
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
| **startingAfterUuid** | **String**| A cursor for pagination. Returns all events occuring after the specified UUID (exclusive) | [optional] |
| **resourceUuid** | **String**| The UUID of the company. If not specified, will return all events for all companies. | [optional] |
| **limit** | **String**| Limits the number of objects returned in a single response, between 1 and 100. The default is 25 | [optional] |
| **eventType** | **String**| A string containing the exact event name (e.g. &#x60;employee.created&#x60;), or use a wildcard match to filter for a group of events (e.g. &#x60;employee.*&#x60;, &#x60;*.created&#x60;, &#x60;notification.*.created&#x60; etc.) | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

