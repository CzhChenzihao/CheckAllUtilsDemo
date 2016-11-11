# CheckAllUtilsDemo
| 使用情况| 方法 | 返回结果|
| ------------- |:-------------:| -----|
| 验证手机格式是否正确 | isMobileNO(String mobiles) |true:正确|
| 验证邮箱格式是否正确 | isEmailAdd(String email) |true:正确 |
| 判断是否有网络连接 | isNetworkConnected(Context context) | true:有网络连接|
| 判断WIFI网络是否可用 |isWifiConnected(Context context) | true:wifi可用|
|判断MOBILE网络是否可用 |isMobileConnected(Context context) |true:mobile网络可用|
|判断网络类型 |isMobileConnected(Context context) |  -1:没有网络，1:WIFI网络，2:wap网络，3:net网络|
|判断服务是否运行 |isServiceRunning(Context mContext, String className) | true:在运行|
|判断apk是否安装 |checkApkExist(Context context, String packageName)| true:已安装|
|判断sd卡是否可以用 |sdCardExists()| true:可用|
|判断一个文件是否存在 |isFileExists(String path)| true:存在|
|判断当前应用程序处于前台还是后台 |isBackground(Context context)|  true:后台，false:前台|
| 判断字符串是否为空 | isNotNull(String string) | true:非空 |
| 判断字符串是否为空和是否等于"" | isNotNull2(String string) |  true:非空且不等于""|
| 判断字符串是否为数字 | isNumber(String number) | true:为数字  |
| 判断字符串是否为带小数的数字| isDecimal(String number) | true:为带小数数字  |
| 判断字符串是否为字母| isLetter(String letter) | true:为字母|
| 判断字符串是否含有汉字| hasChinese(String str) | true:含有汉字|
| 判断数字是奇数还是偶数|isEvenNumbers(String even) | 2:偶数，1:奇数，0:不是基数也不是偶数|
| 判断字符串是否字母开头|isLetterBegin(String s) | true:为字母开头 |
| 判断字符串是否以指定内容开头|startWithMytext(String mytext, String begin) | 第一个参数为需要判断的字符串，第二个参数为指定的内容|
| 判断字符串是否以指定内容结尾|endWithMytext(String mytext, String end)| 第一个参数为需要判断的字符串，第二个参数为指定的内容|
| 判断字符串中是否含有指定内容|hasMytext(String string, String mytext)| 第一个参数为需要判断的字符串，第二个参数为指定的内容|
| 判断身份证是否正确|IDCardValidate(String IDStr)| 有效：返回"" 无效：返回String信息|
