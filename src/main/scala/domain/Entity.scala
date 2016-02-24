package domain

import org.neo4j.ogm.annotation.{GraphId, NodeEntity, Relationship}

import scala.beans.BeanProperty

@NodeEntity
class Entity {

  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var sourceId: String = _

  @Relationship(`type` = "HAS", direction = "OUTGOING")
  var attributes: Set[Attribute] = Set()

  def this(name: String, sourceId: String) {
    this()
    this.name = name
    this.sourceId = sourceId
  }
}
