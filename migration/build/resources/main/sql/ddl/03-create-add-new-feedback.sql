create table add_new_feedback (
  sr_no BIGSERIAL PRIMARY KEY,
  created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
  feedback VARCHAR,
  feedback_to VARCHAR,
  feedback_from VARCHAR
)
