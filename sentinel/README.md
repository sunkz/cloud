### [Sentinel Get Start]( https://github.com/alibaba/spring-cloud-alibaba/wiki/Sentinel )


- wget [sentinel dashboard](https://github-production-release-asset-2e65be.s3.amazonaws.com/128018428/0b2cf280-04dd-11ea-972b-299cfe849f56?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20191130%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20191130T151158Z&X-Amz-Expires=300&X-Amz-Signature=fb971cd6af58f)
- java -Dserver.port=8081 -Dcsp.sentinel.dashboard.server=localhost:8081 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar 
