

# PaymentConfigsUpdateCompanyPaymentConfigsRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fastPaymentLimit** | **String** | Fast payment limit. This limit is an aggregate of all fast payrolls amount. |  |
|**paymentSpeed** | [**PaymentSpeedEnum**](#PaymentSpeedEnum) | Gusto Embedded supports three payment speeds (1-day, 2-day, and 4-day). For next-day payments, funds are deposited in your team&#39;s bank account by the end of the next business day. Most people will see the funds arrive the next afternoon, but payments may arrive as late as the end of the business day. |  |



## Enum: PaymentSpeedEnum

| Name | Value |
|---- | -----|
| _1_DAY | &quot;1-day&quot; |
| _2_DAY | &quot;2-day&quot; |
| _4_DAY | &quot;4-day&quot; |



