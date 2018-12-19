# 字符串和文本I/O学习笔记
### 字符串的比较
比较对象而不是内容 ==

比较内容是否一样String.equals()

equalsIgnorreCase和compareToIgnoreCase忽视大小写比较

regionMathches比较是否部分相等

str.sartsWith(X)是否以X开头

str.endsWith(X)是否以X结尾
### 字符串的长度
.length()返回字符串长度
### 获取字符串
charAt()和Srting.substring()
### 字符串的转换
toLowerCase()全部转换为小写

toUpperCase()全部转换为大写

trim()去掉两端空白

replace(oldchar:char,newchar:char)使用一个新字符替换掉匹配到的字符

replaceFirst()替换掉第一个匹配到的字符

replaceAll()替换掉所有匹配到的字符

split(delimiter:String)返回用界定符分隔的子串所构成的一个字符串数据

### 依照模式匹配替换和分隔
String.matches()使用正则表达式

### 找出字符串中的某几个字符或者某个子串
indexOf()

lastIndexOf()
### 字符串和数组之间相互转换
char[] chars = "Java".toCharArray()

String str = String.valueOf(new char[]{'J','a','v','a'});

## 文件类File和文件输入和输出
### 使用PrintWriter写入
PrintWriter output = new PrintWriter(filename)
### 使用Scanner读数据
Scanner input = new Scanner(new File(filename))