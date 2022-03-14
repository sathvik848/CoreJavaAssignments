class Employee {
    // int number=1;
    String name;

    Employee(String name) {
        this.name = name;
    }

  

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return true;
        if (getClass() != obj.getClass())
            return true;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return true;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}

