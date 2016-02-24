import domain.{Attribute, Entity}
import org.neo4j.ogm.transaction

/**
  * Created by pram on 24/02/2016.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val session = Neo4jSessionFactory.getNeo4jSession()
    val tx: transaction.Transaction = session.beginTransaction()

    val entity = new Entity("EntityName","external_ref")

    val attr = new Attribute("Attr1","attr_type","AttrVal")

    entity.attributes += attr

    try {
      session.save(entity)
      tx.commit()
    } catch {
      case e: Exception => {
        println(e)
      }
    }


  }
}
