import org.neo4j.ogm.session.{Session, SessionFactory};

object Neo4jSessionFactory {
  val sessionFactory = new SessionFactory("domain")

  def getNeo4jSession(): Session = {
    sessionFactory.openSession()
  }
}
