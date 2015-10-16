/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eagle.service.security.hdfs.rest;

import eagle.security.hdfs.entity.FileStatusEntity;

import java.util.List;

/**
 * Response Object for REST Service Call 
 * This will hold the list of Files and Directories
 *  
 *  Example :
 *  /user/hbase/
 *  /user/hbase/data
 *  /user/hbase/data/tables
 */
public class HDFSResourceWebResponse 
{
  	private String exception;
    private List<FileStatusEntity> obj;

    public List<FileStatusEntity> getObj() {
        return obj;
    }

    public void setObj(List<FileStatusEntity> obj) {
        this.obj = obj;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

}
