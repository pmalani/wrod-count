In AWS CloudWatch insights, observe the logs using:
```
fields @timestamp, message
| filter logger like /m.wc/
| sort @timestamp 
| limit 2000
```