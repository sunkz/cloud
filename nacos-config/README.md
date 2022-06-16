### 安装
```shell
git clone https://github.com/nacos-group/nacos-docker.git
cd nacos-docker
docker-compose -f example/standalone-derby.yaml up
```
### 登录
> http://127.0.0.1:8848/nacos/ <br> 
> username=nacos
> pasword=nacos
### 配置
```shell
DataId: nacos-config.properties
# 配置内容 properties
user.name=sunkz
user.age=10
```

### 参考
https://nacos.io/zh-cn/docs/quick-start-docker.html
https://github.com/alibaba/spring-cloud-alibaba/wiki/Nacos-config
