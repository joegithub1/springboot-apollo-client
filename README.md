# springboot-apollo-client
apollo配置客户端



### 1、下载apollo安装包
https://github.com/apolloconfig/apollo-quick-start.git

### 2、创建apollo需要的数据库（mysql版本5.6.5以上）
执行apollo-quick-start\sql

### 3、修改apollo-quick-start\demo.sh
demo.sh脚本中有两个数据库地址，用户名，密码修改成自己的
ApolloConfigDB库
ApolloPortalDB库

### 启动apollo
需要检查8080，8090，8070端口是否被占用

windows系统启动：
 使用git Bash Here，cd apollo-quick-start工作目录：执行：盘符:\\文件路径\\apollo-quick-start\\demo.sh start


### 启动后访问
http://127.0.0.1:8070  默认账号：apollo/admin


