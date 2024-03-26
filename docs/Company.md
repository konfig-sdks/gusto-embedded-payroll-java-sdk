

# Company

The representation of a company in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ein** | **String** | The Federal Employer Identification Number of the company. |  [optional] [readonly] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | The tax payer type of the company. |  [optional] [readonly] |
|**tier** | [**TierEnum**](#TierEnum) | The Gusto product tier of the company (not applicable to Embedded partner managed companies). |  [optional] [readonly] |
|**isSuspended** | **Boolean** | Whether or not the company is suspended in Gusto. Suspended companies may not run payroll. |  [optional] |
|**companyStatus** | [**CompanyStatusEnum**](#CompanyStatusEnum) | The status of the company in Gusto. \&quot;Approved\&quot; companies may run payroll with Gusto. \&quot;Not Approved\&quot; companies may not yet run payroll with Gusto. In order to run payroll, the company may need to complete onboarding or contact support. \&quot;Suspended\&quot; companies may not run payroll with Gusto. In order to unsuspend their account, the company must contact support. |  [optional] [readonly] |
|**uuid** | **String** | A unique identifier of the company in Gusto. |  [optional] [readonly] |
|**name** | **String** | The name of the company. |  [optional] [readonly] |
|**tradeName** | **String** | The trade name of the company. |  [optional] [readonly] |
|**isPartnerManaged** | **Boolean** | Whether the company is fully managed by a partner via the API |  [optional] [readonly] |
|**payScheduleType** | [**PayScheduleTypeEnum**](#PayScheduleTypeEnum) | The pay schedule assignment type. |  [optional] [readonly] |
|**joinDate** | **String** | Company&#39;s first invoiceable event date |  [optional] [readonly] |
|**fundingType** | [**FundingTypeEnum**](#FundingTypeEnum) | Company&#39;s default funding type |  [optional] |
|**locations** | [**List&lt;CompanyAddress&gt;**](CompanyAddress.md) | The locations of the company. |  [optional] [readonly] |
|**compensations** | [**CompanyCompensations**](CompanyCompensations.md) |  |  [optional] |
|**primarySignatory** | [**CompanyPrimarySignatory**](CompanyPrimarySignatory.md) |  |  [optional] |
|**primaryPayrollAdmin** | [**CompanyPrimaryPayrollAdmin**](CompanyPrimaryPayrollAdmin.md) |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| C_CORPORATION | &quot;C-Corporation&quot; |
| S_CORPORATION | &quot;S-Corporation&quot; |
| SOLE_PROPRIETOR | &quot;Sole proprietor&quot; |
| LLC | &quot;LLC&quot; |
| LLP | &quot;LLP&quot; |
| LIMITED_PARTNERSHIP | &quot;Limited partnership&quot; |
| CO_OWNERSHIP | &quot;Co-ownership&quot; |
| ASSOCIATION | &quot;Association&quot; |
| TRUSTEESHIP | &quot;Trusteeship&quot; |
| GENERAL_PARTNERSHIP | &quot;General partnership&quot; |
| JOINT_VENTURE | &quot;Joint venture&quot; |
| NON_PROFIT | &quot;Non-Profit&quot; |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| SIMPLE | &quot;simple&quot; |
| PLUS | &quot;plus&quot; |
| PREMIUM | &quot;premium&quot; |
| CORE | &quot;core&quot; |
| COMPLETE | &quot;complete&quot; |
| CONCIERGE | &quot;concierge&quot; |
| CONTRACTOR_ONLY | &quot;contractor_only&quot; |
| BASIC | &quot;basic&quot; |



## Enum: CompanyStatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;Approved&quot; |
| NOT_APPROVED | &quot;Not Approved&quot; |
| SUSPENDED | &quot;Suspended&quot; |



## Enum: PayScheduleTypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| HOURLY_SALARIED | &quot;hourly_salaried&quot; |
| BY_EMPLOYEE | &quot;by_employee&quot; |
| BY_DEPARTMENT | &quot;by_department&quot; |



## Enum: FundingTypeEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ach&quot; |
| REVERSE_WIRE | &quot;reverse_wire&quot; |
| WIRE_IN | &quot;wire_in&quot; |
| BREX | &quot;brex&quot; |



