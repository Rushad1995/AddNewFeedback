@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  application startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and APPLICATION_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\sample-service-0.1.jar;%APP_HOME%\lib\api-0.1.jar;%APP_HOME%\lib\db.jar;%APP_HOME%\lib\graphql.jar;%APP_HOME%\lib\core.jar;%APP_HOME%\lib\kotlinx-html-jvm-0.7.3.jar;%APP_HOME%\lib\exposed-dao-0.39.1.jar;%APP_HOME%\lib\exposed-jdbc-0.39.1.jar;%APP_HOME%\lib\exposed-core-0.39.1.jar;%APP_HOME%\lib\micronaut-graphql-3.1.0.jar;%APP_HOME%\lib\micronaut-function-aws-api-proxy-3.7.0.jar;%APP_HOME%\lib\micronaut-reactor-2.3.1.jar;%APP_HOME%\lib\micronaut-security-jwt-3.6.3.jar;%APP_HOME%\lib\micronaut-jdbc-hikari-4.6.3.jar;%APP_HOME%\lib\micronaut-function-aws-3.7.0.jar;%APP_HOME%\lib\micronaut-aws-common-3.7.0.jar;%APP_HOME%\lib\micronaut-security-3.6.3.jar;%APP_HOME%\lib\micronaut-jdbc-4.6.3.jar;%APP_HOME%\lib\micronaut-security-annotations-3.6.3.jar;%APP_HOME%\lib\kotlinx-coroutines-core-jvm-1.6.4.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.7.10.jar;%APP_HOME%\lib\micronaut-http-client-3.6.0.jar;%APP_HOME%\lib\micronaut-http-server-netty-3.6.0.jar;%APP_HOME%\lib\micronaut-http-server-3.6.0.jar;%APP_HOME%\lib\micronaut-http-netty-3.6.0.jar;%APP_HOME%\lib\micronaut-websocket-3.6.0.jar;%APP_HOME%\lib\micronaut-http-client-core-3.6.0.jar;%APP_HOME%\lib\micronaut-function-3.6.0.jar;%APP_HOME%\lib\micronaut-runtime-3.6.0.jar;%APP_HOME%\lib\micronaut-router-3.6.0.jar;%APP_HOME%\lib\micronaut-jackson-databind-3.6.0.jar;%APP_HOME%\lib\micronaut-jackson-core-3.6.0.jar;%APP_HOME%\lib\micronaut-json-core-3.6.0.jar;%APP_HOME%\lib\micronaut-http-3.6.0.jar;%APP_HOME%\lib\micronaut-context-3.6.0.jar;%APP_HOME%\lib\micronaut-aop-3.6.0.jar;%APP_HOME%\lib\micronaut-buffer-netty-3.6.0.jar;%APP_HOME%\lib\micronaut-validation-3.6.0.jar;%APP_HOME%\lib\micronaut-inject-3.6.0.jar;%APP_HOME%\lib\logstash-logback-encoder-7.0.1.jar;%APP_HOME%\lib\jackson-module-kotlin-2.13.3.jar;%APP_HOME%\lib\aws-serverless-java-container-core-1.8.2.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.13.3.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.13.3.jar;%APP_HOME%\lib\jackson-databind-2.13.3.jar;%APP_HOME%\lib\jackson-annotations-2.13.3.jar;%APP_HOME%\lib\jackson-core-2.13.3.jar;%APP_HOME%\lib\jakarta.annotation-api-2.1.1.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\logback-classic-1.2.11.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.79.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.79.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.79.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.79.Final.jar;%APP_HOME%\lib\netty-handler-4.1.79.Final.jar;%APP_HOME%\lib\netty-codec-4.1.79.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.79.Final.jar;%APP_HOME%\lib\netty-transport-4.1.79.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.79.Final.jar;%APP_HOME%\lib\graphql-java-16.2.jar;%APP_HOME%\lib\reactor-core-3.4.21.jar;%APP_HOME%\lib\micronaut-core-reactive-3.6.0.jar;%APP_HOME%\lib\reactive-streams-1.0.4.jar;%APP_HOME%\lib\slf4j-simple-1.7.36.jar;%APP_HOME%\lib\micronaut-core-3.6.0.jar;%APP_HOME%\lib\HikariCP-4.0.3.jar;%APP_HOME%\lib\slf4j-api-1.7.36.jar;%APP_HOME%\lib\snakeyaml-1.30.jar;%APP_HOME%\lib\swagger-annotations-2.2.2.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\kotlin-reflect-1.7.10.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.7.10.jar;%APP_HOME%\lib\kotlin-stdlib-1.7.10.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.7.10.jar;%APP_HOME%\lib\aws-lambda-java-core-1.2.1.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.36.jar;%APP_HOME%\lib\nimbus-jose-jwt-9.23.jar;%APP_HOME%\lib\postgresql-42.4.0.jar;%APP_HOME%\lib\netty-resolver-4.1.79.Final.jar;%APP_HOME%\lib\netty-common-4.1.79.Final.jar;%APP_HOME%\lib\jakarta.inject-api-2.0.1.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\java-dataloader-2.2.3.jar;%APP_HOME%\lib\antlr4-runtime-4.8.jar;%APP_HOME%\lib\commons-csv-1.8.jar;%APP_HOME%\lib\commons-lang3-3.12.0.jar;%APP_HOME%\lib\logback-core-1.2.11.jar;%APP_HOME%\lib\checker-qual-3.5.0.jar;%APP_HOME%\lib\javax.ws.rs-api-2.1.jar;%APP_HOME%\lib\commons-fileupload-1.4.jar;%APP_HOME%\lib\httpmime-4.5.13.jar;%APP_HOME%\lib\jcip-annotations-1.0-1.jar;%APP_HOME%\lib\commons-io-2.2.jar;%APP_HOME%\lib\httpclient-4.5.13.jar;%APP_HOME%\lib\httpcore-4.4.13.jar;%APP_HOME%\lib\commons-codec-1.11.jar


@rem Execute application
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %APPLICATION_OPTS%  -classpath "%CLASSPATH%" scalereal.api.ApiApplication %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable APPLICATION_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%APPLICATION_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
