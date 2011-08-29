dataSource {
    pooled = true
    //driverClassName = "org.hsqldb.jdbcDriver"
	driverClassName = "com.mysql.jdbc.Driver"
    //username = "sa"
    //password = ""
	properties {
		maxActive = 50
		maxIdle = 25
		minIdle = 5
		initialSize = 5
		minEvictableIdleTimeMillis = 60000
		timeBetweenEvictionRunsMillis = 60000
		maxWait = 10000
		//validationQuery = "/* ping */"
	}
	//dialect = org.hibernate.dialect.MySQL5InnoDBDialect
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
	show_sql=true
}
// environment specific settings
environments {
    development {
        //dataSource {
        //    dbCreate = "create-drop" // one of 'create', 'create-drop','update'
        //    url = "jdbc:hsqldb:mem:devDB"
        //}
		driverClassName = "com.mysql.jdbc.Driver"
		url = "jdbc:mysql://localhost:3306/my-project"
		username = "root"
		password = ""
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
