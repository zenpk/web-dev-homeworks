# 第二周实验报告
## MySQL Docker 部署
从服务器拉取 mysql 镜像
```shell
docker pull mysql:latest
```
创建 MySQL 的 container 时，由于需要进行一些初始设置，因此采用 docker compose 的方式运行，详细的设置在 yml 文件中
```text
└───docker_mysql
    │   docker-compose.yml
    │
    └───scripts
            init_db.sql
```
执行 compose 命令运行
```shell
cd ./docker_mysql
docker compose up
```
这样一个 MySQL 的 container 就运行在了主机的 12345 端口上，并且已经初始化了用户和表格等信息
## 连接数据库测试是否成功运行
连接 MySQL 数据库，登录到 work2 用户
```sh
mysql -h 127.0.0.1 -P 12345 -u work2 -pwork2 work2
```

