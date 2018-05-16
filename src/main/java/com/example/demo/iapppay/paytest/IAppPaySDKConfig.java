package com.example.demo.iapppay.paytest;

/**
 * 应用接入iAppPay云支付平台sdk集成信息
 */
public class IAppPaySDKConfig {

	/**
	 * 应用名称： 应用在iAppPay云支付平台注册的名称
	 */
	public final static String APP_NAME = "test1";

	/**
	 * 应用编号： 应用在iAppPay云支付平台的编号，此编号用于应用与iAppPay云支付平台的sdk集成 请用商户自己的appid!!
	 */
	public final static String APP_ID = "3019332996";

	/**
	 * 商品编号：
	 * 应用的商品在iAppPay云支付平台的编号，此编号用于iAppPay云支付平台的sdk到iAppPay云支付平台查找商品详细信息（商品名称、商品销售方式、商品价格）
	 * 编号对应商品名称为：1
	 */
	public final static int WARES_ID_1 = 1;

	/**
	 * 应用私钥： 用于对商户应用发送到平台的数据进行加密
	 * 
	 * JAVA请到后台复制pkcs8格式的私钥！！
	 */
	public final static String APPV_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAIia9TxbvyQNLlj/Y7Gr+OAEROpWpFXk4wGQPZVQMYj1IX5KlgEatqRtgUckumjQbssgnvF3yKzK6VjunG1gkiNl+cKeMhLf/mWDfmxRVmCu8VaHBvjRI7xE2pJHKODZhOSQXmYxBQ2l6pxK/VXcy4htl6DVyfcVX2yeSk9bNvorAgMBAAECgYA4TtdjR9YkACLooGzxoZd2j4vwpEIc/bnsvQ4FbAbfE1v4+LmYPvCmGlU9hBAqgDALHqklk2BuiT1iYQittS7HOKos1eiXiDL826hIF7j1qTfnnOHQd0K8Pia/viq2T39QOOSgZqKuA7Me7EHBiQOTyYF9ttuMft5soAHpLhdhQQJBANlU787z21tA+awNynpNd3fmUqeb3dIH/kdn3V9wkECqBPfnp2FsLSmPIzD+CrhOEi4tDjIGFCLx408WgIvjnBsCQQCg6RQVVk/FYldnaogaAVXo2LSkI25N53SE70SF+W7rjRLOEwBvBU03YEf/99jPV5EmoeeHCgnHKwjcIf/mAdsxAkBV4q3+P/pA3rWMG8sXeAOtW1TwrbUEamo/d7lRHR+0njvmaCKKaoCSeuFyXAKKgTfIDcAdXq+Ye7TTrVXRcnpfAkBnixR9Vnkmjs2noonKEinyF+DF7nbAcrwr/rudapDRyonbSabxyfuSMsaiFB7T7Yldzrlp0C/SlgKxhL9ihrdBAkA7qSiJaLVhiYkhtMcDZAfo5pEHJcSF+4AjlPWmvKfu/iTHbWI6frLAOnHYnkvpcZqrPPYcHbX8el5mJX8BjLOf";

	/**
	 * 平台公钥： 用于商户应用对接收平台的数据进行解密 请用商户自己的公钥！！
	 */
	public final static String PLATP_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCrVLFWvWFU2VKWBafNM9U1iA+i7B0IR2s/zEGbh6a9FNuFppbPDbe+CF9OfI2euIHcRpLAwYieHH4CJFMznCTgpTn5RFQ+Osnw65E1byh3UjEfndTsjEvotOnNIO6F3dGdImZvRuJXlK6R9lYhlEOo0Gb3VqmpmWRFjG5FJDOR5wIDAQAB";

}