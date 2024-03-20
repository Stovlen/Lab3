package ua.edu.nung.pz.view;

public class IndexView {
    public static String getPage(String title, String body) {
        return "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <title>" + title + "</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                body +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                "  </body>\n" +
                "</html>";
    }

    public static String getBody(String header, String footer, String context) {
        return header +
                "<div class=\"container\">" +
                context +
                "</div>" +
                footer;
    }

    public static String getHeader(String header) {
        return "<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\n" +
                "  <div class=\"container-fluid\">\n" +
                "    <a class=\"navbar-brand\" href=\"/\">GreenShop</a>\n" +
                "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "      <span class=\"navbar-toggler-icon\"></span>\n" +
                "    </button>\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                "      <ul class=\"navbar-nav\">\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link active\" aria-current=\"page\" href=\"/\">Home</a>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"/pricing\">Pricing</a>\n" +
                "        </li>\n" +
                "\t<li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"/contacts\">Contacts</a>\n" +
                "        </li>\n" +
                "      </ul>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</nav>";
    }

    public static String getFooter(String footer) {
        return "<footer class=\"container-fluid mt-5\">\n" +
                "<div class=\"bg-dark text-secondary px-4 py-5 text-center\">\n" +
                "    <div class=\"py-5\">\n" +
                "      <h1 class=\"display-5 fw-bold text-white\"> <span class=\"text-success\">Green Shop</span>  </h1>\n" +
                "      <div class=\"col-lg-6 mx-auto\">\n" +
                "        <p class=\"fs-5 mb-4\">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>\n" +
                "        <div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center\">\n" +
                "          <button type=\"button\" class=\"btn btn-outline-info btn-lg px-4 me-sm-3 fw-bold\">Custom button</button>\n" +
                "          <button type=\"button\" class=\"btn btn-outline-light btn-lg px-4\">Secondary</button>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</footer>";
    }

    public static String getLoginForm() {
        return  "<form action=\"login\" class=\"my-5\">\n" +
                "  <div class=\"mb-3\">\n" +
                "    <label for=\"webshop-login-form-username\" class=\"form-label\">Email address</label>\n" +
                "    <input type=\"email\" class=\"form-control\" id=\"webshop-login-form-username\" name=\"username\">\n" +
                "  </div>\n" +
                "  <div class=\"mb-3\">\n" +
                "    <label for=\"webshop-login-form-password\" class=\"form-label\">Password</label>\n" +
                "    <input type=\"password\" class=\"form-control\" id=\"webshop-login-form-password\" name=\"password\">\n" +
                "  </div>\n" +
                "  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" +
                "</form>";
    }
}
