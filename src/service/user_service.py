from repository.user_repository import find_by_id, find_all

def get_user_by_id(user_id: int):
    return find_by_id(user_id)

def get_all_users():
    return find_all()
