

# HolidayPayPolicy

Representation of a Holiday Pay Policy

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field. |  |
|**companyUuid** | **String** | A unique identifier for the company owning the holiday pay policy |  |
|**federalHolidays** | [**List&lt;HolidayPayPolicyFederalHolidaysInner&gt;**](HolidayPayPolicyFederalHolidaysInner.md) | List of the eleven supported federal holidays and their details |  |
|**employees** | [**List&lt;TimeOffPolicyEmployeesInner&gt;**](TimeOffPolicyEmployeesInner.md) | List of employee uuids under a time off policy |  |



