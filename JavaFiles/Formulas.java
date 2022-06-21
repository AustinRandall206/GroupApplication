package JavaFiles;

public class Formulas {
        public int Height;
        public int inches;
        public long mile;
        public double heightInInches;
        private String userCar;
        private int epaForUserCar;
        public long milesTraveledByUser;

        public String getUserCar() {
            return userCar;
        }

        public void setUserCar(String userCar) {
            this.userCar = userCar;
        }

        public int getEpaForUserCar() {
            return epaForUserCar;
        }

        public void setEpaForUserCar(int epaForUserCar) {
            this.epaForUserCar = epaForUserCar;
        }

        public long getMilesTraveledByUser() {
            return milesTraveledByUser;
        }

        public void setMilesTraveledByUser(long milesTraveledByUser) {
            this.milesTraveledByUser = milesTraveledByUser;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String UserName;

        public int getHeight() {
            return Height;
        }

        public void setHeight(int height) {
            Height = height;
        }

        public int getInches() {
            return inches;
        }

        public void setInches(int inches) {
            this.inches = inches;
        }

        public long getMile() {
            return mile;
        }

        public void setMile(long mile) {
            this.mile = mile;
        }

        public double getHeightInInches() {
            return heightInInches;
        }

        public void setHeightInInches(double heightInInches) {
            this.heightInInches = heightInInches;
        }


        public double FeetToInches(int feet, int inches){
            this.heightInInches = Double.valueOf((feet*12)+inches);
            return heightInInches;
        }
        public double stepsPerMile(double heightInInches){
            return (heightInInches * .413);
        }
        public long caloriesBurnedPerMile(long mile){
            long caloriesBurnedPerMile = (mile*100L);
            return caloriesBurnedPerMile;
        }
        public float caloriesBurnedPerMileWhileJogging(long mile){
            float caloriesBurnedPerMileWhileJogging = mile*110;
            return caloriesBurnedPerMileWhileJogging;
        }
        public float gallonsOfGasSavedPerMileTraveled(long mile){
            float gallonsOfGasSavedPerMileTraveledFloat = epaForUserCar*milesTraveledByUser;
            return gallonsOfGasSavedPerMileTraveledFloat;
        }

    }

