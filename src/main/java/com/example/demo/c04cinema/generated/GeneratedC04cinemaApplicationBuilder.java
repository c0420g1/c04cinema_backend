package com.example.demo.c04cinema.generated;

import com.example.demo.c04cinema.C04cinemaApplication;
import com.example.demo.c04cinema.C04cinemaApplicationBuilder;
import com.example.demo.c04cinema.C04cinemaApplicationImpl;
import com.example.demo.c04cinema.C04cinemaInjectorProxy;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.AccountManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.AccountSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.banner.BannerManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.banner.BannerSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.buy_combo.BuyComboManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.buy_combo.BuyComboSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.buy_food_drink.BuyFoodDrinkManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.buy_food_drink.BuyFoodDrinkSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.combo.ComboManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.combo.ComboSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.CustomerTypeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.CustomerTypeSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.FoodDrinkManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.FoodDrinkSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall_type.HallTypeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall_type.HallTypeSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.LocationManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.LocationSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.MovieManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.MovieSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociateManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_associate.MovieGenreAssociateSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.MovieGenreTypeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.MovieGenreTypeSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.MovieRatedAgeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.MovieRatedAgeSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.other.OtherManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.other.OtherSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.payment.PaymentManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.payment.PaymentSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.position.PositionManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.position.PositionSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPointManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPointSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.PromotionManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.PromotionSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.role.RoleManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.role.RoleSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccountManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccountSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.SeatManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.SeatSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatTypeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatTypeSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.ShowManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.ShowSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.staff.StaffManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.staff.StaffSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.TheatreManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.TheatreSqlAdapter;
import com.example.demo.c04cinema.c04cinema.c04cinema.ticket_type.TicketTypeManagerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.ticket_type.TicketTypeSqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;
import com.speedment.runtime.connector.mysql.MySqlBundle;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named c04cinema.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedC04cinemaApplicationBuilder extends AbstractApplicationBuilder<C04cinemaApplication, C04cinemaApplicationBuilder> {
    
    protected GeneratedC04cinemaApplicationBuilder() {
        super(C04cinemaApplicationImpl.class, GeneratedC04cinemaMetadata.class);
        withManager(AccountManagerImpl.class);
        withManager(BannerManagerImpl.class);
        withManager(BookingTicketManagerImpl.class);
        withManager(BuyComboManagerImpl.class);
        withManager(BuyFoodDrinkManagerImpl.class);
        withManager(ComboManagerImpl.class);
        withManager(CustomerManagerImpl.class);
        withManager(CustomerTypeManagerImpl.class);
        withManager(FoodDrinkManagerImpl.class);
        withManager(HallManagerImpl.class);
        withManager(HallTypeManagerImpl.class);
        withManager(LocationManagerImpl.class);
        withManager(MovieManagerImpl.class);
        withManager(MovieGenreAssociateManagerImpl.class);
        withManager(MovieGenreTypeManagerImpl.class);
        withManager(MovieRatedAgeManagerImpl.class);
        withManager(OtherManagerImpl.class);
        withManager(PaymentManagerImpl.class);
        withManager(PositionManagerImpl.class);
        withManager(PromoPointManagerImpl.class);
        withManager(PromotionManagerImpl.class);
        withManager(PromotionCustomerManagerImpl.class);
        withManager(RoleManagerImpl.class);
        withManager(RoleAccountManagerImpl.class);
        withManager(SeatManagerImpl.class);
        withManager(SeatTypeManagerImpl.class);
        withManager(ShowManagerImpl.class);
        withManager(StaffManagerImpl.class);
        withManager(TheatreManagerImpl.class);
        withManager(TicketTypeManagerImpl.class);
        withComponent(AccountSqlAdapter.class);
        withComponent(BannerSqlAdapter.class);
        withComponent(BookingTicketSqlAdapter.class);
        withComponent(BuyComboSqlAdapter.class);
        withComponent(BuyFoodDrinkSqlAdapter.class);
        withComponent(ComboSqlAdapter.class);
        withComponent(CustomerSqlAdapter.class);
        withComponent(CustomerTypeSqlAdapter.class);
        withComponent(FoodDrinkSqlAdapter.class);
        withComponent(HallSqlAdapter.class);
        withComponent(HallTypeSqlAdapter.class);
        withComponent(LocationSqlAdapter.class);
        withComponent(MovieSqlAdapter.class);
        withComponent(MovieGenreAssociateSqlAdapter.class);
        withComponent(MovieGenreTypeSqlAdapter.class);
        withComponent(MovieRatedAgeSqlAdapter.class);
        withComponent(OtherSqlAdapter.class);
        withComponent(PaymentSqlAdapter.class);
        withComponent(PositionSqlAdapter.class);
        withComponent(PromoPointSqlAdapter.class);
        withComponent(PromotionSqlAdapter.class);
        withComponent(PromotionCustomerSqlAdapter.class);
        withComponent(RoleSqlAdapter.class);
        withComponent(RoleAccountSqlAdapter.class);
        withComponent(SeatSqlAdapter.class);
        withComponent(SeatTypeSqlAdapter.class);
        withComponent(ShowSqlAdapter.class);
        withComponent(StaffSqlAdapter.class);
        withComponent(TheatreSqlAdapter.class);
        withComponent(TicketTypeSqlAdapter.class);
        withBundle(MySqlBundle.class);
        withInjectorProxy(new C04cinemaInjectorProxy());
    }
    
    @Override
    public C04cinemaApplication build(Injector injector) {
        return injector.getOrThrow(C04cinemaApplication.class);
    }
}