package ohsuvorov;

public class JavaDeveloper implements Collectoin {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) return true;
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
