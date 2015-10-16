#!/bin/sh
#### AlertStreamService: alert streams generated from data source
curl -X POST -H 'Content-Type:application/json' "http://localhost:38080/eagle-service/rest/entities?serviceName=AlertStreamService" -d '[{"prefix":"alertStream","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream"},"desc":"alert event stream from hive query"}]'

#### AlertExecutorService: what alert streams are consumed by alert executor
curl -X POST -H 'Content-Type:application/json' "http://localhost:38080/eagle-service/rest/entities?serviceName=AlertExecutorService" -d '[{"prefix":"alertExecutor","tags":{"dataSource":"hiveQueryLog","alertExecutorId":"hiveAccessAlertByJobHistory","streamName":"hiveAccessLogStream"},"desc":"alert executor for hive query log event stream"}]'

#### AlertStreamSchemaService: schema for event from alert stream
curl -X POST -H 'Content-Type:application/json' "http://localhost:38080/eagle-service/rest/entities?serviceName=AlertStreamSchemaService" -d '[{"prefix":"alertStreamSchema","category":"","attrType":"string","attrValueResolver":"","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream","attrName":"user"}},{"prefix":"alertStreamSchema","category":"","attrType":"string","attrValueResolver":"","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream","attrName":"command"}},{"prefix":"alertStreamSchema","category":"","attrType":"long","attrValueResolver":"","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream","attrName":"timestamp"}},{"prefix":"alertStreamSchema","category":"","attrType":"string","attrValueResolver":"","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream","attrName":"resource"}},{"prefix":"alertStreamSchema","category":"","attrType":"string","attrValueResolver":"","tags":{"dataSource":"hiveQueryLog","streamName":"hiveAccessLogStream","attrName":"sensitivityType"}}]'
