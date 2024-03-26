

# Location

The representation of an address in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the location object. |  [optional] [readonly] |
|**companyUuid** | **String** | The UUID for the company to which the location belongs. Only included if the location belongs to a company. |  [optional] [readonly] |
|**phoneNumber** | **String** | The phone number for the location. Required for company locations. Optional for employee locations. |  [optional] |
|**street1** | **String** |  |  [optional] |
|**street2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**active** | **Boolean** | The status of the location. Inactive locations have been deleted, but may still have historical data associated with them. |  [optional] [readonly] |
|**mailingAddress** | **Boolean** | Specifies if the location is the company&#39;s mailing address. Only included if the location belongs to a company. |  [optional] |
|**filingAddress** | **Boolean** | Specifies if the location is the company&#39;s filing address. Only included if the location belongs to a company. |  [optional] |
|**createdAt** | **String** | Datetime for when location is created |  [optional] |
|**updatedAt** | **String** | Datetime for when location is updated |  [optional] |



