package org.apache.jsp.jsp.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>CETU</title>\n");
      out.write("        <meta name=\"author\" content=\"Surjith S M\">\n");
      out.write("\n");
      out.write("        <!-- SEO -->\n");
      out.write("        <meta name=\"description\" content=\"Tomato is a Responsive HTML5 Template for Restaurants and food related services.\">\n");
      out.write("        <meta name=\"keywords\" content=\"tomato, responsive, html5, restaurant, template, food, reservation\">\n");
      out.write("\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b4b5e95396.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <!-- Responsive Tag -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../cliente/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../cliente/css/font-awesome/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../cliente/css/plugin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../cliente/css/main.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                <script src=\"js/vendor/html5-3.6-respond-1.4.2.min.js\"></script>\n");
      out.write("            <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("        <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("                <!-- Home page-->\n");
      out.write("                <section class=\"home\">\n");
      out.write("                    <div class=\"tittle-block\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"./index.html\">\n");
      out.write("                                <img src=\"img/logo.png\" alt=\"logo\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h1>DELICIOUS Food</h1>\n");
      out.write("                        <h2>Tomato is a delitious restaurant website template</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"scroll-down\">\n");
      out.write("                        <a href=\"#about\">\n");
      out.write("                            <img src=\"img/arrow-down.png\" alt=\"down-arrow\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- About page-->\n");
      out.write("                <section class=\"about\" id=\"about\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"page-header wow fadeInDown\">\n");
      out.write("                                    <h1>the restaurant<small>A little about us and a breif history of how we\n");
      out.write("                                            started.</small></h1>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row wow fadeInUp\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-12 hidden-sm about-photo\">\n");
      out.write("                                            <div class=\"image-thumb\">\n");
      out.write("                                                <img src=\"img/thumb1.png\" data-mfp-src=\"img/fullImages/pic1.jpg\"\n");
      out.write("                                                     class=\"img-responsive\" alt=\"logo\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 about-photo hidden-xs\">\n");
      out.write("                                            <img src=\"img/thumb2.png\" data-mfp-src=\"img/fullImages/pic2.jpg\"\n");
      out.write("                                                 class=\"img-responsive\" alt=\"logo\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6 about-photo hidden-xs\">\n");
      out.write("                                            <img src=\"img/thumb3.png\" data-mfp-src=\"img/fullImages/pic3.jpg\"\n");
      out.write("                                                 class=\"img-responsive\" alt=\"logo\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <p>\n");
      out.write("                                    Cras ut viverra eros. Phasellus sollicitudin sapien id luctus tempor. Sed hend rerit\n");
      out.write("                                    inter dum sagittis. Donec nunc lacus, dapibus nec interdum eget, ultrices eget justo.\n");
      out.write("                                    Nam purus lacus, efficitur eget laoreet sed, finibus nec neque. Cras eget enim in diam\n");
      out.write("                                    dapibus sagittis. In massa est, dignissim in libero ac, fringilla ornare mi. Etiam\n");
      out.write("                                    interdum ligula purus.\n");
      out.write("                                </p>\n");
      out.write("                                <br>\n");
      out.write("                                <p>\n");
      out.write("                                    Ultrices eget justo. Nam purus lacus, efficitur eget laoreet sed, finibus nec neque.\n");
      out.write("                                    Cras eget enim in diam dapibus sagittis. In massa est, dignissim in libero ac, fringilla\n");
      out.write("                                    ornare.\n");
      out.write("                                </p>\n");
      out.write("                                <img src=\"img/signature.png\" alt=\"signature\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Quotes section-->\n");
      out.write("                <div class=\"trusted-quote\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-offset-1 col-md-10\">\n");
      out.write("                                <div class=\"trusted-slider\">\n");
      out.write("                                    <ul class=\"slides\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"img/comida1.jpg\" alt=\"quote\">\n");
      out.write("                                            <p class=\"quote-body\">The world?s a big, big stage for this notorious deli smack\n");
      out.write("                                                in the middle of the theatre district, infamously famous for its\n");
      out.write("                                                over-the-top corned beef and pastrami sandwiches, chopped liver, blintzes,\n");
      out.write("                                                celebrities, salami, smoked fish and New York?s finest cheesecake.</p>\n");
      out.write("                                            <p class=\"quote-author\">Anthony Reed, <span>New York</span></p>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"img/comida1.jpg\" alt=\"quote\">\n");
      out.write("                                            <p class=\"quote-body\">You might not find dragon meat on the menu, but you?ll\n");
      out.write("                                                find pretty much anything else that walks, swims or flies, cooked up in more\n");
      out.write("                                                ways than there are people in the Guangdong province. This Midtown mainstay\n");
      out.write("                                                has a 20-year history of delivering mouth-watering and Cantonese style chow.\n");
      out.write("                                            </p>\n");
      out.write("                                            <p class=\"quote-author\">Gemma Arterton, <span>Bay Area</span></p>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"img/comida1.jpg\" alt=\"quote\">\n");
      out.write("                                            <p class=\"quote-body\">This NYC historical landmark in the heart of the Theatre\n");
      out.write("                                                District has been serving up suds and down home pub food since 1892,\n");
      out.write("                                                surviving prohibition by renting the front of its then Rockefeller Center\n");
      out.write("                                                façade to Greek florists, while the Hurley brothers ran a speak-easy in\n");
      out.write("                                                back.</p>\n");
      out.write("                                            <p class=\"quote-author\">Zachary Burton, <span>Sanfransisco</span></p>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </section>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("   \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Javascript -->\n");
      out.write("<script src=\"../cliente/js/vendor/jquery-1.11.2.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/jquery.flexslider-min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/spectragram.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/velocity.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/velocity.ui.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/bootstrap-datepicker.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/bootstrap-clockpicker.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/isotope.pkgd.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/slick.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/wow.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/animation.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/vegas/vegas.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/jquery.mb.YTPlayer.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/jquery.stellar.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/mc/jquery.ketchup.all.min.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/mc/main.js\"></script>\n");
      out.write("<script src=\"../cliente/js/vendor/validate.js\"></script>\n");
      out.write("<script src=\"../cliente/js/reservation.js\"></script>\n");
      out.write("<!-- Main JS -->\n");
      out.write("<script src=\"../cliente/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
