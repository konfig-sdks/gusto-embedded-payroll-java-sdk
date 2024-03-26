

# Signatory

The representation of a company's signatory

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**version** | **String** | The current version of the signatory. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**birthday** | **String** |  |  [optional] |
|**isAdmin** | **Boolean** | Whether or not the signatory is also the payroll admin of the company. |  [optional] |
|**hasSsn** | **Boolean** | Indicates whether the signatory has an SSN in Gusto. |  [optional] |
|**identityVerificationStatus** | [**IdentityVerificationStatusEnum**](#IdentityVerificationStatusEnum) | |   |   | |---|---| |__Status__| __Description__ | | Pass | Signatory can sign all forms | | Fail | Signatory cannot sign forms | | Skipped | Signatory cannot sign Form 8655 until the form is manually uploaded as wet-signed | | null | Identity verification process has not been completed | |  [optional] |
|**homeAddress** | [**SignatoryHomeAddress**](SignatoryHomeAddress.md) |  |  [optional] |



## Enum: IdentityVerificationStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;Pass&quot; |
| FAIL | &quot;Fail&quot; |
| SKIPPED | &quot;Skipped&quot; |



