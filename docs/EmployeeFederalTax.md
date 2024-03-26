

# EmployeeFederalTax


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**filingStatus** | **String** | It determines which tax return form an individual will use and is an important factor in computing taxable income. One of: - Single - Married - Head of Household - Exempt from withholding - Married, but withhold as Single (does not apply to rev_2020_w4 form) |  [optional] |
|**extraWithholding** | **String** | An employee can request an additional amount to be withheld from each paycheck. |  [optional] |
|**twoJobs** | **Boolean** | If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true. |  [optional] |
|**dependentsAmount** | **String** | A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption. |  [optional] |
|**otherIncome** | **String** | Other income amount. |  [optional] |
|**deductions** | **String** |  |  [optional] |
|**w4DataType** | [**W4DataTypeEnum**](#W4DataTypeEnum) | The version of w4 form. |  [optional] |
|**federalWithholdingAllowance** | **String** | *does not apply to rev_2020_w4 form*  An exemption from paying a certain amount of income tax. |  [optional] |
|**additionalWithholding** | **Boolean** | *does not apply to rev_2020_w4 form* |  [optional] |



## Enum: W4DataTypeEnum

| Name | Value |
|---- | -----|
| PRE_2020_W4 | &quot;pre_2020_w4&quot; |
| REV_2020_W4 | &quot;rev_2020_w4&quot; |



