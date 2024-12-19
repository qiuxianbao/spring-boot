package cn.thinkinjava;

import org.junit.jupiter.api.Test;

/**
 * 系统类
 *
 * @author qiuxianbao
 * @date 2024/11/07
 * @since ace_1.4.2_20240611
 */
public class SystemTest {


	@Test
	public void testGetenv() {
		/**
		 * {
		 *  USERDOMAIN_ROAMINGPROFILE=LAPTOP-ROP3B248,
		 * 	PROCESSOR_LEVEL=6,
		 *
		 * 	RegionCode=APJ,
		 * 	SESSIONNAME=Console,
		 * 	ALLUSERSPROFILE=C:\ProgramData,
		 * 	PROCESSOR_ARCHITECTURE=AMD64,
		 * 	PSModulePath=C:\Program Files\WindowsPowerShell\Modules;
		 * 		C:\Windows\system32\WindowsPowerShell\v1.0\Modules,
		 * 	SystemDrive=C:,
		 * 	MAVEN_HOME=C:\Java\Maven\apache-maven-3.8.1,
		 * 	USERNAME=admin,
		 * 	NODE_JS_HOME=C:\Java\node-v18.15.0,
		 * 	ProgramFiles(x86)=C:\Program Files (x86),
		 * 	FPS_BROWSER_USER_PROFILE_STRING=Default,
		 * 	PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC,
		 * 	DriverData=C:\Windows\System32\Drivers\DriverData,
		 * 	platformcode=KV,
		 * 	ProgramData=C:\ProgramData,
		 * 	ProgramW6432=C:\Program Files,
		 * 	HOMEPATH=\Users\admin,
		 *
		 * 	PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 140 Stepping 1, GenuineIntel,
		 * 	ProgramFiles=C:\Program Files,
		 * 	PUBLIC=C:\Users\Public, windir=C:\Windows, =::=::\,
		 * 	OPENSSL_HOME=C:\Java\OpenSSL-Win64,
		 * 	ZES_ENABLE_SYSMAN=1,
		 * 	LOCALAPPDATA=C:\Users\admin\AppData\Local,
		 * 	IntelliJ IDEA=C:\Java\JetBrains\IDEA2023.3.1\bin;,
		 * 	USERDOMAIN=LAPTOP-ROP3B248,
		 * 	FPS_BROWSER_APP_PROFILE_STRING=Internet Explorer,
		 * 	LOGONSERVER=\\LAPTOP-ROP3B248,
		 * 	JAVA_HOME=C:\Java\JDK\jdk1.8.0_291,
		 * 	GRADLE_HOME=C:\Java\gradle-7.5.1,
		 * 	asl.log=Destination=file,
		 * 	OneDrive=C:\Users\admin\OneDrive,
		 * 	APPDATA=C:\Users\admin\AppData\Roaming,
		 * 	CommonProgramFiles=C:\Program Files\Common Files,
		 * 	Path=C:\Java\VMware Workstation\bin\;
		 * 		C:\Windows\system32;
		 * 		C:\Windows;
		 * 		C:\Windows\System32\Wbem;
		 * 		C:\Windows\System32\WindowsPowerShell\v1.0\;
		 * 		C:\Windows\System32\OpenSSH\;
		 * 		C:\Java\Git\cmd;
		 * 		C:\Java\TortoiseGit\bin;
		 * 		C:\Java\JDK\jdk1.8.0_291\bin;
		 * 		C:\Java\gradle-7.5.1\bin;
		 * 		C:\Java\Maven\apache-maven-3.8.1\bin;
		 * 		C:\Java\node-v18.15.0;
		 * 		C:\Java\OpenSSL-Win64\bin;
		 * 		C:\Java\Graphviz\bin;
		 * 		C:\Java\Microsoft VS Code\bin;
		 * 		C:\Java\微信web开发者工具\dll;
		 * 		C:\Java\TortoiseSVN\bin;
		 * 		C:\Java\PuTTY\;
		 * 		C:\Program Files (x86)\PuTTY\;
		 * 		C:\Java\MATLAB\R2023a\runtime\win64;
		 * 		C:\Java\MATLAB\R2023a\bin;
		 * 		C:\Java\Python\Python311\Scripts\;
		 * 		C:\Java\Python\Python311\;
		 * 		C:\Users\admin\AppData\Local\Microsoft\WindowsApps;;
		 * 		C:\Java\JetBrains\IDEA2023.3.1\bin;,
		 * 		OS=Windows_NT,
		 * 		COMPUTERNAME=LAPTOP-ROP3B248,
		 * 		OnlineServices=Online Services,
		 * 		PROCESSOR_REVISION=8c01,
		 * 		CommonProgramW6432=C:\Program Files\Common Files,
		 * 		ComSpec=C:\Windows\system32\cmd.exe,
		 * 		SystemRoot=C:\Windows,
		 * 		TEMP=C:\Users\admin\AppData\Local\Temp,
		 * 		HOMEDRIVE=C:,
		 * 		USERPROFILE=C:\Users\admin,
		 * 		TMP=C:\Users\admin\AppData\Local\Temp,
		 * 		CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files,
		 * 		NUMBER_OF_PROCESSORS=8,
		 * 		IDEA_INITIAL_DIRECTORY=C:\Users\admin\Desktop
		 * 	}
		 */
		System.out.println(System.getenv());
	}


	@Test
	public void tesGetProperties() {
		/**
		 * {
		 * 	sun.desktop=windows,
		 * 	awt.toolkit=sun.awt.windows.WToolkit,
		 * 	java.specification.version=11,
		 * 	sun.cpu.isalist=amd64,
		 * 	sun.jnu.encoding=GBK,	// 操作系统默认编码
		 * 	org.gradle.test.worker=4,
		 *
		 * 	java.class.path=C:\\Users\\admin\\.gradle\\caches\\7.5.1\\workerMain\\gradle-worker.jar;
		 * 		C:\\gradle\\spring-boot\\learn-lifecycle\\build\\classes\\java\\test;
		 * 		C:\\gradle\\spring-boot\\learn-lifecycle\\build\\classes\\java\\main;
		 *
		 * 		C:\\gradle\\spring-boot\\learn-lifecycle\\build\\resources\\main;
		 *
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-starters\\spring-boot-starter-web\\build\\libs\\spring-boot-starter-web-2.5.16-SNAPSHOT.jar;
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-starters\\spring-boot-starter-json\\build\\libs\\spring-boot-starter-json-2.5.16-SNAPSHOT.jar;
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-starters\\spring-boot-starter\\build\\libs\\spring-boot-starter-2.5.16-SNAPSHOT.jar;
		 *
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-autoconfigure\\build\\libs\\spring-boot-autoconfigure-2.5.16-SNAPSHOT.jar;
		 *
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot\\build\\libs\\spring-boot-2.5.16-SNAPSHOT.jar;
		 *
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.jupiter\\junit-jupiter-params\\5.7.2\\685f832f8c54dd40100f646d61aca88ed9545421\\junit-jupiter-params-5.7.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.jupiter\\junit-jupiter-engine\\5.7.2\\9415680a889f00b8205a094c5c487bc69dc7077d\\junit-jupiter-engine-5.7.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.jupiter\\junit-jupiter-api\\5.7.2\\f4b4079732a9c537983324cfa4e46655f21d2c56\\junit-jupiter-api-5.7.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.platform\\junit-platform-engine\\1.7.2\\2573770b46b8a199ed5f6b0f96fb99e468bfe891\\junit-platform-engine-1.7.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.platform\\junit-platform-commons\\1.7.2\\34adfea6c13fc4a996cf38cdad80800ce850d198\\junit-platform-commons-1.7.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.junit.jupiter\\junit-jupiter\\5.7.2\\62faa742964a9d8dab8fdb4a0eab7b01441c171f\\junit-jupiter-5.7.2.jar;
		 *
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-starters\\spring-boot-starter-tomcat\\build\\libs\\spring-boot-starter-tomcat-2.5.16-SNAPSHOT.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-webmvc\\5.3.39\\89c465ff3d37629a60e1ad4886f61a09a459d639\\spring-webmvc-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-web\\5.3.39\\4ab03cd7376a6b3365d2798aac8d01dcd22c0174\\spring-web-5.3.39.jar;
		 *
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.datatype\\jackson-datatype-jdk8\\2.12.7\\3104f714c0e232740af8661aefb789491098bb3c\\jackson-datatype-jdk8-2.12.7.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.datatype\\jackson-datatype-jsr310\\2.12.7\\6d9393fd0ea1e1900451b5ee05351523725392bb\\jackson-datatype-jsr310-2.12.7.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.module\\jackson-module-parameter-names\\2.12.7\\ba0ff8bb5fd340773b206e71543fb7239cd49ad0\\jackson-module-parameter-names-2.12.7.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.core\\jackson-databind\\2.12.7.1\\48d6674adb5a077f2c04b42795e2e7624997b8b9\\jackson-databind-2.12.7.1.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.core\\jackson-annotations\\2.12.7\\2042461b754cd65ab2dd74a9f19f442b54625f19\\jackson-annotations-2.12.7.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\com.fasterxml.jackson.core\\jackson-core\\2.12.7\\4669a54b799c105572aa8de2a1ae0fe64a17745\\jackson-core-2.12.7.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\jakarta.annotation\\jakarta.annotation-api\\1.3.5\\59eb84ee0d616332ff44aba065f3888cf002cd2d\\jakarta.annotation-api-1.3.5.jar;
		 *
		 * 		C:\\gradle\\spring-boot\\spring-boot-project\\spring-boot-starters\\spring-boot-starter-logging\\build\\libs\\spring-boot-starter-logging-2.5.16-SNAPSHOT.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\ch.qos.logback\\logback-classic\\1.2.12\\d4dee19148dccb177a0736eb2027bd195341da78\\logback-classic-1.2.12.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\ch.qos.logback\\logback-core\\1.2.12\\1d8e51a698b138065d73baefb4f94531faa323cb\\logback-core-1.2.12.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.slf4j\\jul-to-slf4j\\1.7.36\\ed46d81cef9c412a88caef405b58f93a678ff2ca\\jul-to-slf4j-1.7.36.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apache.logging.log4j\\log4j-to-slf4j\\2.17.2\\17dd0fae2747d9a28c67bc9534108823d2376b46\\log4j-to-slf4j-2.17.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.slf4j\\slf4j-api\\1.7.36\\6c62681a2f655b49963a5983b8b0950a6120ae14\\slf4j-api-1.7.36.jar;
		 *
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.yaml\\snakeyaml\\1.28\\7cae037c3014350c923776548e71c9feb7a69259\\snakeyaml-1.28.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apache.tomcat.embed\\tomcat-embed-websocket\\9.0.75\\236a09fb990d3f3c15af22cc7e3cf5bce73fe5c3\\tomcat-embed-websocket-9.0.75.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apache.tomcat.embed\\tomcat-embed-core\\9.0.75\\a431d28cd877f3e45bfad7e8cc4c9ca3f4a2a206\\tomcat-embed-core-9.0.75.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apache.tomcat.embed\\tomcat-embed-el\\9.0.75\\8b97771742cbd402ad1350190f8d08b240e1793b\\tomcat-embed-el-9.0.75.jar;
		 *
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-context\\5.3.39\\286538ca4b3890192d63c88fdd1616adde17dc0e\\spring-context-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-aop\\5.3.39\\3af1f0d73ec1e031c7083c848342989f413ca275\\spring-aop-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-beans\\5.3.39\\87770ce736cbd777c07866cbc8a06b879765e3c8\\spring-beans-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-expression\\5.3.39\\25cf07399eb7ac3fc13888b20dc4d67124ec75bd\\spring-expression-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-core\\5.3.39\\d2bff2eedf27b51d6ef9a2fc892aaff5b7a768dd\\spring-core-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apache.logging.log4j\\log4j-api\\2.17.2\\f42d6afa111b4dec5d2aea0fe2197240749a4ea6\\log4j-api-2.17.2.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.springframework\\spring-jcl\\5.3.39\\45181955845ae69c51c72746f00200f7babca558\\spring-jcl-5.3.39.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.apiguardian\\apiguardian-api\\1.1.0\\fc9dff4bb36d627bdc553de77e1f17efd790876c\\apiguardian-api-1.1.0.jar;
		 * 		C:\\Users\\admin\\.gradle\\caches\\modules-2\\files-2.1\\org.opentest4j\\opentest4j\\1.2.0\\28c11eb91f9b6d8e200631d46e20a7f407f2a046\\opentest4j-1.2.0.jar,
		 *
		 * 	java.vm.vendor=Eclipse Adoptium,
		 * 	sun.arch.data.model=64,
		 * 	user.variant=,
		 * 	java.vendor.url=https://adoptium.net/,
		 * 	user.timezone=Asia/Shanghai,
		 * 	os.name=Windows 10,
		 * 	java.vm.specification.version=11,
		 * 	user.country=CN,
		 * 	sun.java.launcher=SUN_STANDARD,
		 * 	sun.boot.library.path=C:\Java\JDK\jdk-11.0.25\bin,
		 * 	sun.java.command=worker.org.gradle.process.internal.worker.GradleWorkerMain 'Gradle Test Executor 4',
		 * 	jdk.debug=release,
		 * 	sun.cpu.endian=little,
		 * 	user.home=C:\Users\admin,
		 * 	user.language=zh,
		 * 	java.specification.vendor=Oracle Corporation,
		 * 	org.gradle.native=false,
		 * 	java.version.date=2024-10-15,
		 * 	java.home=C:\Java\JDK\jdk-11.0.25,
		 * 	file.separator=\,
		 * 	java.vm.compressedOopsMode=32-bit,
		 * 	line.separator=,
		 *
		 *  java.specification.name=Java Platform API Specification,
		 *  java.vm.specification.vendor=Oracle Corporation,
		 *  java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment,
		 *  user.script=,
		 *  sun.management.compiler=HotSpot 64-Bit Tiered Compilers,
		 *  java.runtime.version=11.0.25+9,
		 *  user.name=admin,
		 *  path.separator=;,
		 *  os.version=10.0,
		 *  java.runtime.name=OpenJDK Runtime Environment,
		 *  file.encoding=UTF-8,
		 *  java.vm.name=OpenJDK 64-Bit Server VM,
		 *  java.vendor.version=Temurin-11.0.25+9,
		 *  java.vendor.url.bug=https://github.com/adoptium/adoptium-support/issues,
		 *  java.io.tmpdir=C:\Users\admin\AppData\Local\Temp\,
		 *  java.version=11.0.25,
		 *  user.dir=C:\gradle\spring-boot\learn-lifecycle,
		 *  os.arch=amd64,
		 *  java.vm.specification.name=Java Virtual Machine Specification,
		 *  java.awt.printerjob=sun.awt.windows.WPrinterJob,
		 *  sun.os.patch.level=,
		 *
		 *  org.gradle.internal.worker.tmpdir=C:\gradle\spring-boot\learn-lifecycle\build\tmp\test\work,
		 *  java.library.path=C:\Java\JDK\jdk-11.0.25\bin;
		 *  	C:\Windows\Sun\Java\bin;
		 *  	C:\Windows\system32;
		 *  	C:\Windows;
		 *  	C:\Java\VMware Workstation\bin\;
		 *  	C:\Windows\system32;
		 *  	C:\Windows;
		 *  	C:\Windows\System32\Wbem;
		 *  	C:\Windows\System32\WindowsPowerShell\v1.0\;
		 *  	C:\Windows\System32\OpenSSH\;
		 *  	C:\Java\Git\cmd;
		 *  	C:\Java\TortoiseGit\bin;
		 *  	C:\Java\JDK\jdk1.8.0_291\bin;
		 *  	C:\Java\gradle-7.5.1\bin;
		 *  	C:\Java\Maven\apache-maven-3.8.1\bin;
		 *  	C:\Java\node-v18.15.0;
		 *  	C:\Java\OpenSSL-Win64\bin;
		 *  	C:\Java\Graphviz\bin;
		 *  	C:\Java\Microsoft VS Code\bin;
		 *  	C:\Java\微信web开发者工具\dll;
		 *  	C:\Java\TortoiseSVN\bin;
		 *  	C:\Java\PuTTY\;
		 *  	C:\Program Files (x86)\PuTTY\;
		 *  	C:\Java\MATLAB\R2023a\runtime\win64;
		 *  	C:\Java\MATLAB\R2023a\bin;
		 *  	C:\Java\Python\Python311\Scripts\;
		 *  	C:\Java\Python\Python311\;
		 *  	C:\Users\admin\AppData\Local\Microsoft\WindowsApps;;
		 *  	C:\Java\JetBrains\IDEA2023.3.1\bin;;.,
		 *  	java.vm.info=mixed mode,
		 *  	java.vendor=Eclipse Adoptium,
		 *  	java.vm.version=11.0.25+9,
		 *  	java.specification.maintenance.version=3,
		 *  	sun.io.unicode.encoding=UnicodeLittle,
		 *  	java.class.version=55.0
		 * }
		 */
		System.out.println(System.getProperties());
	}

}
