package domain

import org.neo4j.ogm.annotation.{EndNode, GraphId, RelationshipEntity, StartNode}

import scala.beans.BeanProperty

@RelationshipEntity(`type` = "HAS")
class Has {

  @GraphId
  @BeanProperty
  var id: java.lang.Long = _

  @StartNode
  var entity: Entity = _

  @EndNode
  var attribute: Attribute = _

  def this(entity: Entity, attribute: Attribute) {
    this()
    this.entity = entity
    this.attribute = attribute
  }
}
