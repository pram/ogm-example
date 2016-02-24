package domain

import org.neo4j.ogm.annotation.{GraphId, NodeEntity, Relationship}

import scala.beans.BeanProperty

@NodeEntity
class Attribute {

  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var `type`: String = _

  @BeanProperty
  var value: String = _

  @Relationship(`type` = "HAS", direction = "INCOMING")
  var entity: Entity = _

  def this(name: String, `type`: String, value: String) {
    this()
    this.name = name
    this.`type` = `type`
    this.value = value
  }
}
