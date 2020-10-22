INSERT INTO public.t_roles (role_id, role_name, created_time, created_by) values (1, 'Admin', CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_roles (role_id, role_name, created_time, created_by) values (2, 'Tech Lead', CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_roles (role_id, role_name, created_time, created_by) values (3, 'Developer', CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_roles (role_id, role_name, created_time, created_by) values (4, 'SDET', CURRENT_TIMESTAMP, 'inital load');

INSERT INTO public.t_user_details(user_id, user_name, password, created_time, created_by) values (1, 'Anand', 'Anand', CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_user_details(user_id, user_name, password, created_time, created_by) values (2, 'Kirupa', 'Kirupa', CURRENT_TIMESTAMP, 'inital load');

INSERT INTO public.t_user_roles(user_role_id, user_id, role_id, created_time, created_by) values (1, 1, 1, CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_user_roles(user_role_id, user_id, role_id, created_time, created_by) values (2, 1, 2, CURRENT_TIMESTAMP, 'inital load');
INSERT INTO public.t_user_roles(user_role_id, user_id, role_id, created_time, created_by) values (3, 2, 3, CURRENT_TIMESTAMP, 'inital load');