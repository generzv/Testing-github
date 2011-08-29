class BootStrap {

    def init = { servletContext ->
		if (!Book.count()) {
			new Book(author: "Gener", title: "La Gargola").save(failOnError: true)
			new Book(author: "La Gargola", title: "El Gener").save(failOnError: true)
		}
    }

    def destroy = {
    }
}
