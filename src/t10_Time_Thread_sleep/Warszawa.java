package t10_Time_Thread_sleep;

public class Warszawa {
        public static volatile boolean isStopped = false;

        public static void main(String[] args) throws InterruptedException {
            Clock clock = new Clock("Warszawie", 23, 59, 50);
            Thread.sleep(10000);
            isStopped = true;
            Thread.sleep(1000);
        }

        public static class Clock extends Thread {
            private String cityName;
            private int hours;
            private int minutes;
            private int seconds;

            public Clock(String cityName, int hours, int minutes, int seconds) {
                this.cityName = cityName;
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
                start();
            }

            public void run() {
                try {
                    while (!isStopped) {
                        printTime();
                    }
                } catch (InterruptedException e) {
                }
            }

            private void printTime() throws InterruptedException {

                seconds++;

                if (seconds == 60) {
                    seconds = 0;
                    minutes ++;
                }
                if (minutes == 60){
                    minutes = 0;
                    hours++;
                }

                if (hours == 24){
                    hours = 0;
                }

                if (hours == 0 && minutes == 0 && seconds == 0) {
                    System.out.println(String.format("Wybiła północ w %s!", cityName));
                } else {
                    System.out.println(String.format("W %s jest teraz godzina %02d:%02d:%02d!", cityName, hours, minutes, seconds));
                }

                Thread.sleep(1000);
            }
        }
}
