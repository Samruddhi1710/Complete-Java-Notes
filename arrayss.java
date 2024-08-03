public class arrayss  {
        public static String[] country(String country){
            ParkService.ParksImplPort Locator = new ParkService.ParksImplPort();
            return Locator.byCountry(country);
        }
    }
}
