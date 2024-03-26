

# EmployeeBenefitsCreateBenefitRecordRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyBenefitUuid** | **String** | The UUID of the company benefit. |  |
|**active** | **Boolean** | Whether the employee benefit is active. |  [optional] |
|**employeeDeduction** | **String** | The amount to be deducted, per pay period, from the employee&#39;s pay. |  [optional] |
|**deductAsPercentage** | **Boolean** | Whether the employee deduction amount should be treated as a percentage to be deducted from each payroll. |  [optional] |
|**employeeDeductionAnnualMaximum** | **String** | The maximum employee deduction amount per year. A null value signifies no limit. |  [optional] |
|**contribution** | [**EmployeeBenefitsCreateBenefitRecordRequestContribution**](EmployeeBenefitsCreateBenefitRecordRequestContribution.md) |  |  [optional] |
|**elective** | **Boolean** | Whether the company contribution is elective (aka \&quot;matching\&quot;). For &#x60;tiered&#x60;, &#x60;elective_amount&#x60;, and &#x60;elective_percentage&#x60; contribution types this is ignored and assumed to be &#x60;true&#x60;. |  [optional] |
|**companyContributionAnnualMaximum** | **String** | The maximum company contribution amount per year. A null value signifies no limit. |  [optional] |
|**limitOption** | **String** | Some benefits require additional information to determine their limit. For example, for an HSA benefit, the limit option should be either \&quot;Family\&quot; or \&quot;Individual\&quot;. For a Dependent Care FSA benefit, the limit option should be either \&quot;Joint Filing or Single\&quot; or \&quot;Married and Filing Separately\&quot;. |  [optional] |
|**catchUp** | **Boolean** | Whether the employee should use a benefit’s \&quot;catch up\&quot; rate. Only Roth 401k and 401k benefits use this value for employees over 50. |  [optional] |
|**coverageAmount** | **String** | The amount that the employee is insured for. Note: company contribution cannot be present if coverage amount is set. |  [optional] |
|**coverageSalaryMultiplier** | **String** | The coverage amount as a multiple of the employee’s salary. Only applicable for Group Term Life benefits. Note: cannot be set if coverage amount is also set. |  [optional] |
|**deductionReducesTaxableIncome** | [**DeductionReducesTaxableIncomeEnum**](#DeductionReducesTaxableIncomeEnum) | Whether the employee deduction reduces taxable income or not. Only valid for Group Term Life benefits. Note: when the value is not \&quot;unset\&quot;, coverage amount and coverage salary multiplier are ignored. |  [optional] |
|**companyContribution** | **String** | The amount to be paid, per pay period, by the company. |  [optional] |
|**contributeAsPercentage** | **Boolean** | Whether the company contribution amount should be treated as a percentage to be deducted from each payroll. |  [optional] |



## Enum: DeductionReducesTaxableIncomeEnum

| Name | Value |
|---- | -----|
| UNSET | &quot;unset&quot; |
| REDUCES_TAXABLE_INCOME | &quot;reduces_taxable_income&quot; |
| DOES_NOT_REDUCE_TAXABLE_INCOME | &quot;does_not_reduce_taxable_income&quot; |
| NULL | &quot;null&quot; |



