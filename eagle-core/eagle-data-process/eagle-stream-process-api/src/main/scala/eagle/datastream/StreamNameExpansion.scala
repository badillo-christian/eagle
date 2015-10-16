/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one or more
 *  * contributor license agreements.  See the NOTICE file distributed with
 *  * this work for additional information regarding copyright ownership.
 *  * The ASF licenses this file to You under the Apache License, Version 2.0
 *  * (the "License"); you may not use this file except in compliance with
 *  * the License.  You may obtain a copy of the License at
 *  *
 *  *    http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package eagle.datastream

import java.util.regex.Pattern

import com.typesafe.config.{Config, ConfigObject, ConfigValue}
import org.jgrapht.experimental.dag.DirectedAcyclicGraph
import org.slf4j.LoggerFactory

import scala.collection.JavaConverters._

/**
 * to set name for each StreamProducer
 * 1. if name is given programatically, then use this name
 * 2. otherwise use name generated by scala internally
 */
class StreamNameExpansion(config: Config) extends StreamDAGExpansion(config){
  val LOG = LoggerFactory.getLogger(classOf[StreamNameExpansion])

  override def expand(dag: DirectedAcyclicGraph[StreamProducer, StreamConnector]) = {
    val iter = dag.iterator()
    while(iter.hasNext){
      val sp = iter.next()
      sp.name = NodeNameSelector(sp).getName
    }
  }
}
